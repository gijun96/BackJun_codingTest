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
		in, _ := (reader.ReadString('\n'))
		str := strings.TrimSpace(in)
		a, _ := strconv.Atoi(strings.Split(str, " ")[0])
		b, _ := strconv.Atoi(strings.Split(str, " ")[1])
		result := strconv.Itoa(a + b)
		writer.WriteString(result + "\n")

	}
	writer.Flush()

}
