def matchingStrings(stringList, queries):
    results = []
    for query in queries:
        count = 0
        for string in stringList:
            if query == string:
                count += 1                
        results.append(count)
    return results

if __name__ == '__main__':
    stringList_count = int(input("Enter number of strings in stringList: ").strip())

    stringList = []
    print("Enter the strings:")
    for _ in range(stringList_count):
        stringList_item = input()
        stringList.append(stringList_item)

    queries_count = int(input("Enter number of queries: ").strip())

    queries = []
    print("Enter the queries:")
    for _ in range(queries_count):
        queries_item = input()
        queries.append(queries_item)

    res = matchingStrings(stringList, queries)

    print("\nResults:")
    for r in res:
        print(r)
