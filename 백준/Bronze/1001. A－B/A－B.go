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
	inputs := scanner.Text()
	a, _ := strconv.Atoi(strings.Split(inputs, " ")[0])
	b, _ := strconv.Atoi(strings.Split(inputs, " ")[1])

	fmt.Println(a - b)

}
