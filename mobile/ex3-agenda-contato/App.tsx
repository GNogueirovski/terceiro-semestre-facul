import { StatusBar } from 'expo-status-bar';
import { Image, StyleSheet, Text, TextInput, useWindowDimensions, View } from 'react-native';
import { LinearGradient } from "expo-linear-gradient";
import livro from "./assets/livros.png";

export default function App() {
    const dimensions = useWindowDimensions();
    const width = dimensions.width
    const height = dimensions.height
    return (
        <View style={{}}>
            <View style={{ backgroundColor: "white", alignItems: "center" }}>
                <View style={{ backgroundColor: "cornflowerblue", borderBottomLeftRadius: 20, borderBottomRightRadius: 20 }}>
                    <Text style={{ fontSize: 48, color: "white", fontWeight: "bold", textAlign: "center" }}>Agenda de Contatos</Text>
                </View>
                <Image source={livro} width={100} height={100} />
            </View>
            <LinearGradient colors={["lightgray", "lightskyblue"]}
                start={{ x: 0, y: 0 }}
                end={{ x: 1, y: 0 }}
                style={{
                    backgroundColor: "navy", width: width, height: height,
                    marginTop: 20
                }}>
                <View style={{
                    flexDirection: "row", width: width,
                    margin: 30
                }}>
                    <Text style={{ fontSize: 24, color: "lightyellow", fontWeight: "bold" }}>Nome</Text>
                    <TextInput style={{
                        backgroundColor: "white", marginLeft: 50, width: 200, borderColor: "blue", borderRadius: 15,
                        borderWidth: 2
                    }} />
                </View>
                <View style={{
                    flexDirection: "row", width: width,
                    margin: 30
                }}>
                    <Text style={{ fontSize: 24, color: "lightyellow", fontWeight: "bold" }}>Telefone</Text>
                    <TextInput style={{
                        backgroundColor: "white", marginLeft: 50, width: 200, borderColor: "blue", borderRadius: 15,
                        borderWidth: 2
                    }} />
                </View>
                <View style={{
                    flexDirection: "row", width: width,
                    margin: 30
                }}>
                    <Text style={{ fontSize: 24, color: "lightyellow", fontWeight: "bold" }}>Email</Text>
                    <TextInput style={{
                        backgroundColor: "white", marginLeft: 50, width: 200, borderColor: "blue", borderRadius: 15,
                        borderWidth: 2
                    }} />
                </View>
            </LinearGradient>
            <StatusBar style="auto" />
        </View>
    );
}

