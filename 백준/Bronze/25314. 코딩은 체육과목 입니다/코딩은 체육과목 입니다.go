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

	var result string
	count := N / 4

	for i := 1; i <= count; i++ {
		result += "long "
	}

	fmt.Printf("%sint", result)
}
