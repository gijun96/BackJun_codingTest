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

	arr := strings.Split(scanner.Text(), " ")

	seen := make(map[string]bool)
	var res []int
	var 중복값 int

	for _, val := range arr {
		if !seen[val] {
			seen[val] = true
			i, _ := strconv.Atoi(val)
			res = append(res, i)
		} else {
			j, _ := strconv.Atoi(val)
			중복값 = j
		}
	}

	var result int
	if 중복값 != 0 {
		배열 := len(res)
		if 배열 == 2 {
			result = 1000 + (중복값 * 100)
		} else if 배열 == 1 {
			result = 10000 + (중복값 * 1000)
		}
	} else {
		var max int
		for _, value := range arr {
			var a, _ = strconv.Atoi(value)
			if a > max {
				max = a
			}
		}
		result = max * 100
	}
	fmt.Println(result)

}
