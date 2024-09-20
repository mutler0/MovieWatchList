# README: Movie List Comparison Tool

This tool is designed to compare two text or CSV files containing movie lists and identify similarities between them. It is particularly useful for merging datasets, finding common movies, or analyzing differences between movie collections.

## Features

- **File Format Support**: Accepts both `.txt` and `.csv` files.
- **Comparison Metrics**:
  - **Title Matching**: Identifies movies with identical titles.
  - **Genre Matching**: Finds movies with matching genres.
  - **Year Matching**: Detects movies released in the same year.
- **Output**: Generates a report highlighting the similarities and differences between the two files.

## Usage

1. **Input Files**: Prepare two files, each containing a list of movies. Ensure that the files are in the same format (either both `.txt` or both `.csv`).
2. **Running the Tool**:
   - If you have the executable version, run it and follow the on-screen instructions to select the input files and specify the comparison criteria.
   - If you have the source code, compile it using your preferred compiler and then execute the program.
3. **Output**: After the comparison, the tool will display a summary of the findings, including the number of matching titles, genres, and release years. It will also provide details on movies that are unique to each file.

## Requirements

- **Operating System**: Compatible with Windows, macOS, and Linux.

## Notes

- This was a fun little side project to solve the problem of not knowing what to watch. Developing this tool taught me a lot about handling file input/output, managing different formats (CSV vs. TXT), and optimizing comparison algorithms for speed and accuracy. 
