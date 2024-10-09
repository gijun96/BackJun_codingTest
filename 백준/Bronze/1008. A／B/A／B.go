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
	a, _ := strconv.ParseFloat(input[0], 32)
	b, _ := strconv.ParseFloat(input[1], 32)

	fmt.Println(a / b)

}
