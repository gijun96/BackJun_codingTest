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

	N, _ := strconv.Atoi(scanner.Text())

	var sum int
	for i := 1; i <= N; i++ {
		sum = sum + i
	}

	fmt.Println(sum)
}
