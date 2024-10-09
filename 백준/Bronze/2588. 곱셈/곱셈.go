package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {

	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	a, _ := strconv.Atoi(scanner.Text())
	scanner.Scan()
	val2 := scanner.Text()
	b, _ := strconv.Atoi(val2)

	rArr := []rune(val2)

	for i := len(rArr) - 1; i >= 0; i-- {
		val, _ := strconv.Atoi(string(rArr[i]))
		fmt.Println(a * val)
	}
	fmt.Println(a * b)

}
