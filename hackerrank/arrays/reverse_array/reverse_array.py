def reverseArray(a):
    return a[::-1]

if __name__ == "__main__":
    arr = list(map(int, input().split()))
    print(' '.join(map(str, reverseArray(arr))))