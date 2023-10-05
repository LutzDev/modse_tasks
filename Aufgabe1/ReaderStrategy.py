from FieldExtractor import FieldExtractor


class ReaderStrategy:
    def __init__(self, code: str, target):
        self.code: str = code
        self._target = target
        self._extractors: list = []

    def add_field_extractor(self, begin: int, end: int, target: str) -> None:
        self._extractors.append(FieldExtractor(begin, end, target))

    def process(self, line: str) -> object:
        attributes: dict = {}
        for extractor in self._extractors:
            attributes[extractor.target_property_name] = extractor.extract_field(line)

        return self._target(**attributes)

