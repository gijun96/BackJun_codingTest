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
	A, _ := strconv.Atoi(input[0])
	B, _ := strconv.Atoi(input[1])
	C, _ := strconv.Atoi(input[2])

	fmt.Println((A + B) % C)
	fmt.Println(((A % C) + (B % C)) % C)
	fmt.Println((A * B) % C)
	fmt.Println(((A % C) * (B % C)) % C)

}
