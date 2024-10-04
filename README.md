#include <iostream>
#include <fcntl.h>    // For open(), O_RDONLY, O_WRONLY, O_CREAT
#include <unistd.h>   // For read(), write(), close()
#include <sys/types.h> // For ssize_t
#include <cstring>    // For strerror()

int main() {
    const char* sourceFile = "source.txt";       // Source file name
    const char* destFile = "destination.txt";    // Destination file name

    // Open the source file
    int sourceFd = open(sourceFile, O_RDONLY);
    if (sourceFd < 0) {
        std::cerr << "Error opening source file: " << strerror(errno) << std::endl;
        return 1; // Return with an error code if source file is not found
    }

    // Open (or create) the destination file
    int destFd = open(destFile, O_WRONLY | O_CREAT | O_TRUNC, 0644);
    if (destFd < 0) {
        std::cerr << "Error opening/creating destination file: " << strerror(errno) << std::endl;
        close(sourceFd); // Close the source file descriptor
        return 1; // Return with an error code if destination file cannot be opened/created
    }

    // Buffer for reading and writing
    char buffer[4096];
    ssize_t bytesRead;
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // Read from the source file and write to the destination file
    while ((bytesRead = read(sourceFd, buffer, sizeof(buffer))) > 0) {
        if (write(destFd, buffer, bytesRead) != bytesRead) {
            std::cerr << "Error writing to destination file: " << strerror(errno) << std::endl;
            close(sourceFd);
            close(destFd);
            return 1; // Return with an error code if write fails
        }
    }

    if (bytesRead < 0) {
        std::cerr << "Error reading source file: " << strerror(errno) << std::endl;
    } else {
        std::cout << "File copied successfully!" << std::endl;
    }

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 while ((bytesRead = read(sourceFd, buffer, sizeof(buffer))) > 0) {
        write(destFd, buffer, bytesRead); // Write directly, ignoring errors for simplicity
    }
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    // Close the file descriptors
    close(sourceFd);
    close(destFd);

    return 0;
}
