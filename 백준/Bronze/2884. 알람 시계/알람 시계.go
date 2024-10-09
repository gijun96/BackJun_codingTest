package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()

	H, _ := strconv.Atoi(strings.Split(scanner.Text(), " ")[0])
	M, _ := strconv.Atoi(strings.Split(scanner.Text(), " ")[1])

	var 알람_시 int
	var 알람_분 int

	if M < 45 {
		if H == 0 {
			H = 24
		}
		알람_시 = H - 1
		알람_분 = (M + 60) - 45
	} else {
		알람_시 = H
		알람_분 = M - 45
	}

	fmt.Printf("%d %d", 알람_시, 알람_분)

}
