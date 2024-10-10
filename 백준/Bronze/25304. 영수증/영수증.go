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

	전체금액, _ := strconv.Atoi(scanner.Text())

	scanner.Scan()

	물건갯수, _ := strconv.Atoi(scanner.Text())

	var result int

	for i := 0; i < 물건갯수; i++ {
		scanner.Scan()
		row := strings.Split(scanner.Text(), " ")
		price, _ := strconv.Atoi(row[0])
		count, _ := strconv.Atoi(row[1])

		result = result + (price * count)
	}
	if 전체금액 == result {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}

}
