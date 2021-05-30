package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var x = sadArray.size-2
        var sadArray2 = sadArray
        var i = 1
        while (i <= x){
            if (sadArray2[i] > (sadArray2[i-1] + sadArray2[i+1])){
                var sadArray3 = sadArray2.filterIndexed { index, _ ->
                    index != i
                }
                sadArray2 = sadArray3.toIntArray()
                x--
                if(i != 1) {i--}
            } else{
                i++
            }
        }
        return sadArray2
    }
}

