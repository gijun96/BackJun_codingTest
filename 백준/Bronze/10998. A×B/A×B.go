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

	input := strings.Split(scanner.Text(), " ")

	a, _ := strconv.Atoi(input[0])
	b, _ := strconv.Atoi(input[1])

	fmt.Println(a * b)

}
