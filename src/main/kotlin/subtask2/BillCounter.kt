package subtask2

class BillCounter {


    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        var bill2 = bill.filterIndexed { index, _ ->
            index != k
        }
        var count = 0
        for (element in bill2) {
            count += element
        }

        if(count/2 == b){
            return "bon appetit"
        } else{
            var count2 = 0
            for (element in bill) {
                count2 += element
            }
            var sum = count2/2 - count/2
            if(b > count2/2){
                sum += b - count2/2

            }
            return sum.toString()
        }

    }
}
