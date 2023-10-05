from classes.SingleMove import SingleMove


class MoveGroup:
    def __init__(self, index: str = None, white_move_str: str = None, black_move_str: str = None):
        self.index: str = index
        # self.white_move: SingleMove = None
        # self.black_move: SingleMove = None
        self.index: str = index
        self.white_move: SingleMove = SingleMove(white_move_str)
        self.black_move: SingleMove = SingleMove(black_move_str)

    def __repr__(self):
        return "MoveGroup Class"
