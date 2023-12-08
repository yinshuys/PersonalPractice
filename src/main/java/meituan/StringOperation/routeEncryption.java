package meituan.StringOperation;

/**
 * 假定一段路径记作字符串 path，其中以 "." 作为分隔符。现需将路径加密，
 * 加密方法为将 path 中的分隔符替换为空格 " "，请返回加密后的字符串。
 */
public class routeEncryption {
    public String pathEncryption(String path) {
        return path.replace("."," ");
    }
}
