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

	N, _ := strconv.Atoi(scanner.Text())

	for i := 0; i < N; i++ {
		scanner.Scan()
		input := strings.Split(scanner.Text(), " ")
		a, _ := strconv.Atoi(input[0])
		b, _ := strconv.Atoi(input[1])

		fmt.Println(a + b)
	}

}
