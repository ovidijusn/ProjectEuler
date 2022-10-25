use std::fs;

fn main() {
    solve_59();
}

fn solve_59() {
    let file_path = "files/p059_cipher.txt";
    let contents = fs::read_to_string(file_path).expect("Should have been able to read the file");

    for c1 in 97..=122 {
        for c2 in 97..=122 {
            for c3 in 97..=122 {
                let key: [u8; 3] = [c1, c2, c3];
                let text = decrypt(key, &contents);
                if text.contains("the ") && text.contains("to ") {
                    println!("{}", text);
                    let sum: i32 = text.as_bytes().iter().map(|c| i32::from(*c)).sum();
                    println!("Sum of original text ASCII values: {}", sum);
                    break;
                }
            }
        }
    }
}

fn decrypt(key: [u8; 3], contents: &String) -> String {
    return contents
        .split(",")
        .map(|s| s.parse::<u8>().unwrap())
        .enumerate()
        .map(|(i, c)| (c ^ key[i % 3]) as char)
        .collect();
}
