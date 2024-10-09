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

	scanner.Scan()
	t, _ := strconv.Atoi(scanner.Text())

	t_H := t / 60
	t_M := t % 60

	시간 := H + t_H
	분 := M + t_M

	추가_시 := 분 / 60
	if 추가_시 != 0 {
		분 = 분 % 60
		시간 = 시간 + 추가_시
	}

	if 시간 > 23 {
		시간 = 시간 % 24
	}

	fmt.Printf("%d %d", 시간, 분)

}
