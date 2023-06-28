fun main() {

    var num = readln().toInt()
    var count = 0

    while (num>2) {
        if((num%5)%3==0) {
            count += num/5 + num%5 / 3
            num = 0
            break
        }
        else {
            num -= 3
            count++
        }
    }


    if(num == 0) print(count) else print(-1)
}