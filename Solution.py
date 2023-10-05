def solution(H):
    big_rectangle_stack = []
    dict_for_cotain_check = {}

    num_of_blocks = 0
    for h_elm in H:
        while(True):
            if len(big_rectangle_stack) != 0 and h_elm < big_rectangle_stack[-1]:
                val = big_rectangle_stack.pop()
                del dict_for_cotain_check[val]
            else:
                break

        if h_elm in dict_for_cotain_check:
            pass
        else:
            big_rectangle_stack.append(h_elm)
            num_of_blocks += 1
            dict_for_cotain_check[h_elm] = 0

    return num_of_blocks    