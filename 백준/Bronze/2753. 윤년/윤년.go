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

	연도, _ := strconv.Atoi(scanner.Text())
	var 윤년 int
	if (연도%4 == 0 &&
		연도%100 != 0) ||
		연도%400 == 0 {
		윤년 = 1
	} else {
		윤년 = 0
	}

	fmt.Println(윤년)

}
