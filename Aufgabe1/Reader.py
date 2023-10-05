import os
from ReaderStrategy import ReaderStrategy


class Reader:
    def __init__(self):
        self.strategies: dict = {}

    def add_strategy(self, reader_strategy: ReaderStrategy):
        self.strategies[reader_strategy.code] = reader_strategy

    # def add_condidtional_strategy(self, condition, true_strategy: ReaderStrategy, false_strategy: ReaderStrategy):
    #     self.strategies[true_strategy.code] = (condition, true_strategy, false_strategy)

    def process(self, _filename: str) -> list:
        f = open(_filename, "r")
        result: list = []
        for line in f:
            self._process_line(line, result)

        return result

    def _process_line(self, line: str, result: list) -> None:
        code = line[0:4]

        if code in self.strategies:
            strategy: ReaderStrategy = self.strategies[code]
            result.append(strategy.process(line))
