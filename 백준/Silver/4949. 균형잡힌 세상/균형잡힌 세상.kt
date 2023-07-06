fun main() {
    while (true) {
        var str = readln()
        if (str == ".") break
        str = str.lowercase()
        for (i in 'a'..'z') {
            str = str.replace("${i}", "")
        }
        str = str.replace(" ", "").replace(".","")
        while("()" in str || "[]" in str || "{}" in str) {
            str = str.replace("()","").replace("[]","").replace("{}","")
        }
        if(str.length > 0) println("no") else println("yes")
    }
}