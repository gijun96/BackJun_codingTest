package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {

	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	x, _ := strconv.Atoi(scanner.Text())
	scanner.Scan()
	y, _ := strconv.Atoi(scanner.Text())

	양수_X := []string{"1", "4"}
	음수_X := []string{"2", "3"}

	var r1 = []string{}

	if x > 0 {
		r1 = 양수_X
	} else {
		r1 = 음수_X
	}

	if y > 0 {
		fmt.Println(r1[0])
	} else {
		fmt.Println(r1[1])
	}

}
