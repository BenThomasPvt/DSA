def hourglassSum(arr):
    max_sum = -63  # Minimum possible hourglass sum (-9*7)

    for i in range(4):
        for j in range(4):
            top = arr[i][j] + arr[i][j+1] + arr[i][j+2]
            middle = arr[i+1][j+1]
            bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]

            hourglass = top + middle + bottom

            if hourglass > max_sum:
                max_sum = hourglass

    return max_sum

if __name__ == '__main__':
    print("Enter a 6x6 grid of space-separated integers:")
    arr = []

    for _ in range(6):
        row = list(map(int, input().strip().split()))
        arr.append(row)

    result = hourglassSum(arr)
    print("Maximum hourglass sum:", result)
