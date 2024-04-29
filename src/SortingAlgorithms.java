class SortingAlgorithms:
    def selectionSort(arr):
    n = len(arr)
        for i in range(n):
    min_index = 1
    for j in range(i + 1, n):
    if arr[j] < arr[min_index]:
    min_index = j
    arr[i], arr[min_index] = arr[min_index], arr[i]

    arr = [9, 3, 15, 7, 21, 13, 5, 11]
    SortingAlgorithms.selectionSort(arr)
    print("The sorted integer array is as follows:", arr)
