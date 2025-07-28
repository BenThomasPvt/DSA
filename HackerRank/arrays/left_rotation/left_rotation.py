def rotateLeft(d, arr):
    # Rotate the array d times to the left
    return arr[d:] + arr[:d]

if __name__ == '__main__':
    first_multiple_input = input("Enter n and d separated by space: ").rstrip().split()
    n = int(first_multiple_input[0])
    d = int(first_multiple_input[1])

    arr = list(map(int, input(f"Enter {n} integers separated by space: ").rstcdrip().split()))

    result = rotateLeft(d, arr)

    # Print the result directly to console
    print(' '.join(map(str, result)))
