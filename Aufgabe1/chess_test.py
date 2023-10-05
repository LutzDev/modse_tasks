from Reader import Reader
from ReaderStrategy import ReaderStrategy
from classes.MoveGroup import MoveGroup

chess_rolls = [" ", "K", "D", "T", "L", "S"]

def configure_move_group() -> ReaderStrategy:
    result: ReaderStrategy = ReaderStrategy("MOVE", MoveGroup)
    result.add_field_extractor(4, 8, "index")
    result.add_field_extractor(9, 13, "white_move_str")
    result.add_field_extractor(14, 18, "black_move_str")
    return result

# test= configure_usage()
# print(test.code)

def configure(target: Reader) -> None:
    target.add_strategy(configure_move_group())

reader: Reader = Reader()
configure(reader)
result = reader.process("datasets/A1_b_chess_1_wm2019_short.txt")
for value in result:
    print(value)
    for attr, field in vars(value).items():
        print(attr, field)
    print()
