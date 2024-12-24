from typing import List
# [[1]  [1,1]    [1,2,1]    [1,3,3,1]  [1,4,6,4,1]  [1,5,10,10,5,1]  [1,6,15,20,15,6,1]  [1,7,21,35,35,21,7,1]   [1,8,28,56,70,56,28,8,1] 


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:  
        result = [[1]]  #caso base 

        for i in range(1,numRows)
            tamanho = i+1
            array = [0] * tamanho
            array[0] = 1
            array[-1] = 1

            for j in range (1,tamanho-1)
                array[j] = result[i-1][j-1] + result[i-1][j]

            result.append(array)
    return result