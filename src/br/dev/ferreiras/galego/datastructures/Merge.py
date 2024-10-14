def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    def merge_sort_recursive(arr, temp, left_start, right_end):
        if left_start >= right_end:
            return
        middle = (left_start + right_end) // 2
        merge_sort_recursive(arr, temp, left_start, middle)
        merge_sort_recursive(arr, temp, middle + 1, right_end)
        merge(arr, temp, left_start, middle, right_end)

    def merge(arr, temp, left_start, middle, right_end):
        left = left_start
        right = middle + 1
        index = left_start
        while left <= middle and right <= right_end:
            if arr[left] <= arr[right]:
                temp[index] = arr[left]
                left += 1
            else:
                temp[index] = arr[right]
                right += 1
            index += 1
        while left <= middle:
            temp[index] = arr[left]
            left += 1
            index += 1
        while right <= right_end:
            temp[index] = arr[right]
            right += 1
            index += 1
        for i in range(left_start, right_end + 1):
            arr[i] = temp[i]
    n = len(arr)
    temp = arr.copy()
    merge_sort_recursive(arr, temp, 0, n - 1)