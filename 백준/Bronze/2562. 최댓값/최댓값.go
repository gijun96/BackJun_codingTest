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

	var maxIndex int
	var max int = 0
	for i := 1; i < 10; i++ {
		str, _ := reader.ReadString('\n')
		num, _ := strconv.Atoi(strings.TrimSpace(str))
		if max < num {
			max = num
			maxIndex = i
		}
	}

	fmt.Println(max)
	fmt.Println(maxIndex)
	writer.Flush()
}
