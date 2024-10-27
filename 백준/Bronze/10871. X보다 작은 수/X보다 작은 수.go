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

	N := strings.TrimSpace(strings.Split(fir, " ")[0])
	limit, _ := strconv.Atoi(N)
	X := strings.TrimSpace(strings.Split(fir, " ")[1])

	arr := strings.Fields(strings.Trim(strArr, " "))

	for i := 0; i < limit && i < len(arr); i++ {
		j, _ := strconv.Atoi(arr[i])
		tar, _ := strconv.Atoi(X)

		if tar > j {
			fmt.Printf("%d ", j)
		}
	}
	writer.Flush()
}
