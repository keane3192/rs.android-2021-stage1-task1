package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var arr2 : MutableList<String> = mutableListOf<String>()
        var charr = "<[(".toCharArray()
        var x = 0
        while(inputString.indexOfAny(charr, x) != -1){
            var indxchar = inputString.indexOfAny(charr, x)
            x = indxchar + 1
            var check = -1
            if(inputString[indxchar].toString().equals("<",true)){
                check = checkIn("<",">",inputString,x)
                if (check != -1){
                    arr2.add(inputString.substring(x, check))
                }

            }
            else if(inputString[indxchar].toString().equals("[",true)){
                check = checkIn("[","]",inputString,x)
                if (check != -1){
                    arr2.add(inputString.substring(x, check))
                }
            }
            else if(inputString[indxchar].toString().equals("(",true)){
                check = checkIn("(",")",inputString,x)
                if (check != -1){
                    arr2.add(inputString.substring(x, check))
                }
            }
        }
        return arr2.toTypedArray()
    }

    fun checkIn(open: String, close: String, inputString: String, x:Int):Int{

        var close1 = inputString.indexOf(close, x)
        var inopen1 = inputString.indexOf(open, x)

        while(inopen1 != -1 && inopen1 < close1){
            close1 = inputString.indexOf(close, close1+1)
            inopen1 = inputString.indexOf(open, inopen1+1)
        }
        return close1



    }
}
