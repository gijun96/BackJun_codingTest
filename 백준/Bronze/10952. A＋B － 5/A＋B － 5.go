package main

import (
	"bufio"
	"os"
	"strconv"
	"strings"
)

func main() {

	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter(os.Stdout)

	for {
		inputData, _ := reader.ReadString('\n')
		a, _ := strconv.Atoi(strings.Split(strings.TrimSpace(inputData), " ")[0])
		b, _ := strconv.Atoi(strings.Split(strings.TrimSpace(inputData), " ")[1])
		if a == 0 && b == 0 {
			break
		}
		sum := strconv.Itoa(a + b)
		writer.WriteString(sum + "\n")
	}

	writer.Flush()

}
