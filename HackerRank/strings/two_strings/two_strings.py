def twoStrings(s1, s2):
    # Initial approach:
    '''
    for l in s1:
        if l in s2:
            return 'YES'
    return 'NO'
    '''
    # Modified (optimized) approach:
    return 'YES' if set(s1) & set(s2) else 'NO'

if __name__ == '__main__':
    s1 = input("Enter first string: ")
    s2 = input("Enter second string: ")
    result = twoStrings(s1, s2)
    print(result)
