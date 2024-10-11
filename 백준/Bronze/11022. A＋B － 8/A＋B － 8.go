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

	input, _ := reader.ReadString('\n')
	count, _ := strconv.Atoi(strings.TrimSpace(input))

	for i := 0; i < count; i++ {
		inputData, _ := reader.ReadString('\n')
		a, _ := strconv.Atoi(strings.Split(strings.TrimSpace(inputData), " ")[0])
		b, _ := strconv.Atoi(strings.Split(strings.TrimSpace(inputData), " ")[1])
		A := strconv.Itoa(a)
		B := strconv.Itoa(b)
		idx := strconv.Itoa(i + 1)
		sum := strconv.Itoa(a + b)
		writer.WriteString("Case #" + idx + ": "+ A + " + "+ B +" = "+ sum + "\n")
	}

	writer.Flush()

}
