class pypattern:
    def pyramid(self, rows):
        for i in range(1, rows + 1):
            # print spaces
            for j in range(rows - i):
                print(" ", end="")
            # print stars
            for k in range(2 * i - 1):
                print("*", end="")
            print()

rows = int(input("Enter number of rows: "))
obj = pypattern()
obj.pyramid(rows)
