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

	for {
		input, err := reader.ReadString('\n')
		if err != nil {
			break
		}
		A, _ := strconv.Atoi(strings.TrimSpace(strings.Split(input, " ")[0]))
		B, _ := strconv.Atoi(strings.TrimSpace(strings.Split(input, " ")[1]))

		fmt.Println(A + B)
		writer.Flush()

	}

}
