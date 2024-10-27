package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {

	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter(os.Stdout)

	input, _ := reader.ReadString('\n')

	count, _ := strconv.Atoi(strings.TrimSpace(input))

	for i := 0; i < count; i++ {
		space := count - i
		for s := 0; s < space-1; s++ {
			fmt.Print(" ")
		}

		for j := 0; j < i+1; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}

	writer.Flush()

}
