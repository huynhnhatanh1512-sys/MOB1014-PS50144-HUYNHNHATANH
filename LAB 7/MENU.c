#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <windows.h>

// Hàm dọn dẹp bộ nhớ đệm nhập xuất
void xoaBoNhoDem() {
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

void demNguyenAmPhuAm() {
    char chuoi[50];
    int nguyenAm = 0;
    int phuAm = 0;

    printf("Nhập chuỗi: ");
    fgets(chuoi, sizeof(chuoi), stdin);

    for (int i = 0; chuoi[i] != '\0'; i++) {
        char c = tolower((unsigned char)chuoi[i]);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            nguyenAm++;
        }
        else if (isalpha((unsigned char)c)) {
            phuAm++;
        }
    }

    printf("Số nguyên âm: %d\n", nguyenAm);
    printf("Số phụ âm: %d\n", phuAm);
}

void dangNhap() {
    char taiKhoanHeThong[] = "admin";
    char matKhauHeThong[] = "123456";

    char taiKhoan[20];
    char matKhau[20];

    printf("Nhập tài khoản: ");
    scanf("%19s", taiKhoan);

    printf("Nhập mật khẩu: ");
    scanf("%19s", matKhau);
    xoaBoNhoDem(); // Dọn dẹp đệm sau khi scanf

    if (strcmp(taiKhoan, taiKhoanHeThong) == 0 &&
        strcmp(matKhau, matKhauHeThong) == 0) {
        printf("Đăng nhập thành công!\n");
    } else {
        printf("Username hoặc Password không chính xác!\n");
    }
}

void sapXepChuoiAlphabet() {
    char s[5][50];
    char temp[50];

    for (int i = 0; i < 5; i++) {
        printf("Nhập chuỗi %d: ", i + 1);
        scanf("%49s", s[i]);
    }
    xoaBoNhoDem(); // Dọn dẹp đệm sau khi scanf

    for (int i = 0; i < 4; i++) {
        for (int j = i + 1; j < 5; j++) {
            if (strcmp(s[i], s[j]) > 0) {
                strcpy(temp, s[i]);
                strcpy(s[i], s[j]);
                strcpy(s[j], temp);
            }
        }
    }

    printf("\nCác chuỗi sau khi sắp xếp:\n");
    for (int i = 0; i < 5; i++) {
        printf("%s\n", s[i]);
    }
}

void thapPhanSangNhiPhan() {
    int n;
    char nhiPhan[50];
    int count = 0;

    printf("Nhập n (số nguyên không âm): ");
    if (scanf("%d", &n) != 1 || n < 0) {
        printf("Số nhập vào không hợp lệ!\n");
        xoaBoNhoDem();
        return;
    }
    xoaBoNhoDem();

    // Xử lý trường hợp đặc biệt n = 0
    if (n == 0) {
        printf("Nhị phân: 0\n");
        return;
    }

    int N = n;
    while (N > 0) {
        int du = N % 2;
        nhiPhan[count] = du + '0';
        count++;
        N = N / 2;
    }

    printf("Nhị phân: ");
    for (int i = count - 1; i >= 0; i--) {
        printf("%c", nhiPhan[i]);
    }
    printf("\n");
}

int main() {
    SetConsoleOutputCP(65001); // Hỗ trợ in tiếng Việt UTF-8 trên Windows

    int luachon;

    do {
        printf("\n+-----------------------------------------------------------+\n");
        printf("|                  MENU CHƯƠNG TRÌNH LAB 7                  |\n");
        printf("+-----------------------------------------------------------+\n");
        printf("| 1. Đếm Nguyên âm và Phụ âm trong chuỗi                    |\n");
        printf("| 2. Đăng nhập hệ thống (User & Password)                   |\n");
        printf("| 3. Sắp xếp danh sách Chuỗi theo thứ tự Alphabet           |\n");
        printf("| 4. Chuyển đổi số Thập phân sang Nhị phân (Chuỗi)          |\n");
        printf("| 5. Thoát chương trình                                     |\n");
        printf("+-----------------------------------------------------------+\n");

        printf(">> Xin mời chọn chức năng (1-5): ");

        if (scanf("%d", &luachon) != 1) {
            printf("\n[Lỗi] Bạn phải nhập một số! Vui lòng thử lại.\n");
            xoaBoNhoDem();
            continue;
        }
        xoaBoNhoDem(); // Dọn dẹp đệm sau khi nhập menu

        switch (luachon) {
        case 1:
            printf("\n--- CHỨC NĂNG 1: ĐẾM NGUYÊN ÂM VÀ PHỤ ÂM ---\n");
            demNguyenAmPhuAm();
            break;

        case 2:
            printf("\n--- CHỨC NĂNG 2: ĐĂNG NHẬP HỆ THỐNG ---\n");
            dangNhap();
            break;

        case 3:
            printf("\n--- CHỨC NĂNG 3: SẮP XẾP CHUỖI ALPHABET ---\n");
            sapXepChuoiAlphabet();
            break;

        case 4:
            printf("\n--- CHỨC NĂNG 4: CHUYỂN THẬP PHÂN SANG NHỊ PHÂN ---\n");
            thapPhanSangNhiPhan();
            break;

        case 5:
            printf("\n---> Đang thoát chương trình... Tạm biệt!\n");
            break;

        default:
            printf("\n[Lỗi] Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 5.\n");
            break;
        }

    } while (luachon != 5);

    return 0;
}