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

	inputs := strings.Split(scanner.Text(), " ")
	a, _ := strconv.Atoi(inputs[0])
	b, _ := strconv.Atoi(inputs[1])

	var result string
	if a > b {
		result = ">"
	} else if a < b {
		result = "<"
	} else {
		result = "=="
	}

	fmt.Println(result)

}
