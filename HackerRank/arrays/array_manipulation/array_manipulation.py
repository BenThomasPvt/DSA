def arrayManipulation(n, queries):
    """
    Approach 1 :

    arr = [0] * (n + 1)
    for a, b, k in queries:
        for i in range(a, b + 1):
            arr[i] += k
    return max(arr) #Got compile time error, too slow
    """

    # Approach 2:
    arr = [0] * (n + 2)

    for a, b, k in queries:
        arr[a] += k
        arr[b + 1] -= k

    max_val = 0
    current = 0

    for i in range(1, n + 1):
        current += arr[i]
        if current > max_val:
            max_val = current

    return max_val


if __name__ == '__main__':
    n = 5
    queries = [
        [1, 2, 100],
        [2, 5, 100],
        [3, 4, 100]
    ]

    result = arrayManipulation(n, queries)
    print(result)  # Should print 200
