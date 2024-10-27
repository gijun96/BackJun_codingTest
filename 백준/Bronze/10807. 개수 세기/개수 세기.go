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

	strN, _ := reader.ReadString('\n')
	N, _ := strconv.Atoi(strings.TrimSpace(strN))

	data, _ := reader.ReadString('\n')
	list := strings.Fields(strings.TrimSpace(data))

	f, _ := reader.ReadString('\n')
	tar := (strings.TrimSpace(f))

	var count int = 0

	for i := 0; i < N && i < len(list); i++ {
		if list[i] == tar {

			count++
		}
	}

	fmt.Printf("%d", count)

	writer.Flush()

}
