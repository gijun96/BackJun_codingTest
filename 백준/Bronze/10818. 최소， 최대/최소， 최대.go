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

	fir, _ := reader.ReadString('\n')

	strArr, _ := reader.ReadString('\n')

	N := strings.TrimSpace(fir)
	limit, _ := strconv.Atoi(N)

	arr := strings.Fields(strings.Trim(strArr, " "))
	max := -1000000
	min := 10000000
	for i := 0; i < limit && i < len(arr); i++ {
		ele, _ := strconv.Atoi(arr[i])
		if max < ele {
			max = ele
		}

		if min > ele {
			min = ele
		}
	}
	fmt.Print(min, " ", max)
	writer.Flush()
}
