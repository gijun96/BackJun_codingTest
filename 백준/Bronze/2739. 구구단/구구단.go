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

	for i := 1; i < 10; i++ {
		fmt.Printf("%d * %d = %d \n", N, i, N*i)
	}

}
