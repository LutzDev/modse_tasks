import re


class SingleMove:
    def __init__(self, line: str):
        self.piece: str = ""
        self.square: str = ""
        self.action: str = ""
        self.destination: str = ""
        self.convert_to_attributes(line)

    def __repr__(self):
        return "( piece: " + str(self.piece) + " , square: " + str(self.square) + " , action: " + str(
            self.action) + " , destination: " + str(self.destination) + " )"

    def convert_to_attributes(self, line):
        pawn_reg = "[ a-h]"
        files = "[a-h]"
        ranks = "[1-8]"
        other_roll_reg = "[KDTLS]"
        position_reg = files + ranks
        action_reg = "x"
        square_file_reg = "([a-h]x)|([a-h][a-h])"
        square_rank_reg = "([1-8]x)|([1-8][a-h])"

        is_special_move = False
        is_pawn = False
        is_other_roll = False

        if re.search(pawn_reg, line[0]):
            is_pawn = True
        elif re.search(other_roll_reg, line[0]):
            is_other_roll = True
        else:
            is_special_move = True

        if is_special_move:
            self.piece = None
            self.action = line
        elif is_pawn or is_other_roll:
            if is_other_roll:
                self.piece = line[0]
            else:
                self.piece = " "

            if re.search(action_reg, line):
                self.action = re.findall(action_reg, line)[0]

            if re.search(position_reg, line):
                self.destination = re.findall(position_reg, line)[0]

            if re.search(square_file_reg, line):
                self.square = re.findall(files, line)[0]

            if re.search(square_rank_reg, line):
                self.square = re.findall(ranks, line)[0]