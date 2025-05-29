def dynamicArray(n, queries):
    arr = [[] for _ in range(n)]
    lastAnswer = 0
    result = []

    for query in queries:
        one, x, y = query
        index = (x ^ lastAnswer) % n

        if one == 1:
            arr[index].append(y)
        elif one == 2:
            lastAnswer = arr[index][y % len(arr[index])]
            result.append(lastAnswer)

    return result


if __name__ == '__main__':
    # Take inputs from user
    n, q = map(int, input("Enter n and number of queries (q): ").split())

    print(f"Enter {q} queries (each of the form: 1 x y or 2 x y):")
    queries = [list(map(int, input().split())) for _ in range(q)]

    # Call the function
    result = dynamicArray(n, queries)

    # Print the output
    print("Output:")
    for val in result:
        print(val)
