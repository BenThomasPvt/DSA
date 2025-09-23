n = 5

for i in range (n,0,-1):
    for j in range (i,1,-1):
        print(" ", end="")

    for j in range ((2*(n-i))+1):
        print("*",end="")
    print()

'''
Optimized approach
def nStarTriangle(n: int) -> None:
    for i in range(n):
        spaces = " " * (n - i - 1)
        stars = "*" * (2 * i + 1)
        print(spaces + stars)'''