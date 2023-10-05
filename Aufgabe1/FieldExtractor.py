
class FieldExtractor:
    def __init__(self, begin: int, end: int, target: str):
        self._begin: int = begin
        self._end: int = end
        self.target_property_name: str = target

    def extract_field(self, line: str) -> object:
        return line[self._begin:(self._end+1)]


